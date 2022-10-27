/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Country;
import model.Film;
import model.Genres;

/**
 *
 * @author Admin
 */
public class FilmDao extends DBContext {

    public List<Film> getAllFilm() {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "select * from Films f \n"
                    + "left join Genres g on f.GenreID = g.GenreID \n"
                    + "left join Countries c on f.CountryCode = c.CountryCode";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film fl = new Film();
                fl.setFilmId(rs.getInt("FilmID"));
                fl.setTitle(rs.getString("title"));
                fl.setImage(rs.getString("img"));
                fl.setImageSlide(rs.getString("images_slide"));
                fl.setActor(rs.getString("actor"));
                fl.setAuthor(rs.getString("author"));
                fl.setDescription(rs.getString("description"));
                fl.setTime(rs.getInt("time"));
                Genres gen = new Genres();
                gen.setGenresId(rs.getInt("GenreId"));
                gen.setName(rs.getString("name"));
                fl.setGenres(gen);
                Country country = new Country();
                country.setCode(rs.getString("CountryCode"));
                country.setCountryName(rs.getString("CountryName"));
                fl.setCountry(country);
                films.add(fl);
            }
            return films;
        } catch (SQLException ex) {
            Logger.getLogger(FilmDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int registerFilm(int genID, String title, String code, String image,
            Date premiere, String actor, String author, int time, String image_slide, String description) {
        try {
            String sql = "INSERT INTO [dbo].[Films]\n"
                    + "           ([GenreID]\n"
                    + "           ,[Title]\n"
                    + "           ,[CountryCode]\n"
                    + "           ,[img]\n"
                    + "           ,[premiere]\n"
                    + "           ,[actor]\n"
                    + "           ,[author]\n"
                    + "           ,[time]\n"
                    + "           ,[description]\n"
                    + "           ,[images_slide])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, genID);
            stm.setString(2, title);
            stm.setString(3, code);
            stm.setString(4, image);
            stm.setDate(5, premiere);
            stm.setString(6, actor);
            stm.setString(7, author);
            stm.setInt(8, time);
            stm.setString(9, description);
            stm.setString(10, image_slide);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FilmDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public Film getFilmByID(int filmId) {
        try {
            String sql = "select * from Films f \n"
                    + "left join Genres g on f.GenreID = g.GenreID \n"
                    + "left join Countries c on f.CountryCode = c.CountryCode \n"
                    + "where filmID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, filmId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Film fl = new Film();
                fl.setFilmId(rs.getInt("FilmID"));
                fl.setTitle(rs.getString("title"));
                fl.setImage(rs.getString("img"));
                fl.setImageSlide(rs.getString("images_slide"));
                fl.setActor(rs.getString("actor"));
                fl.setAuthor(rs.getString("author"));
                fl.setDescription(rs.getString("description"));
                fl.setTime(rs.getInt("time"));
                Genres gen = new Genres();
                gen.setGenresId(rs.getInt("GenreId"));
                gen.setName(rs.getString("name"));
                fl.setGenres(gen);
                Country country = new Country();
                country.setCode(rs.getString("CountryCode"));
                country.setCountryName(rs.getString("CountryName"));
                fl.setCountry(country);
                return fl;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilmDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Film> getFilmByCategory(int genreId) {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "select * from Films f \n"
                    + "left join Genres g on f.GenreID = g.GenreID \n"
                    + "left join Countries c on f.CountryCode = c.CountryCode"
                    + "where f.GenreID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, genreId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film fl = new Film();
                fl.setFilmId(rs.getInt("FilmID"));
                fl.setTitle(rs.getString("title"));
                fl.setImage(rs.getString("img"));
                fl.setImageSlide(rs.getString("images_slide"));
                fl.setActor(rs.getString("actor"));
                fl.setAuthor(rs.getString("author"));
                fl.setDescription(rs.getString("description"));
                fl.setTime(rs.getInt("time"));
                Genres gen = new Genres();
                gen.setGenresId(rs.getInt("GenreId"));
                gen.setName(rs.getString("name"));
                fl.setGenres(gen);
                Country country = new Country();
                country.setCode(rs.getString("CountryCode"));
                country.setCountryName(rs.getString("CountryName"));
                fl.setCountry(country);
                films.add(fl);
            }
            return films;
        } catch (SQLException ex) {
            Logger.getLogger(FilmDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Film> getNewFilmTop6() {
        List<Film> films = new ArrayList<>();
        try {
            String sql = "select top 6 * from Films f \n"
                    + "left join Genres g on f.GenreID = g.GenreID \n"
                    + "left join Countries c on f.CountryCode = c.CountryCode";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Film fl = new Film();
                fl.setFilmId(rs.getInt("FilmID"));
                fl.setTitle(rs.getString("title"));
                fl.setImage(rs.getString("img"));
                fl.setImageSlide(rs.getString("images_slide"));
                fl.setActor(rs.getString("actor"));
                fl.setAuthor(rs.getString("author"));
                fl.setDescription(rs.getString("description"));
                fl.setTime(rs.getInt("time"));
                Genres gen = new Genres();
                gen.setGenresId(rs.getInt("GenreId"));
                gen.setName(rs.getString("name"));
                fl.setGenres(gen);
                Country country = new Country();
                country.setCode(rs.getString("CountryCode"));
                country.setCountryName(rs.getString("CountryName"));
                fl.setCountry(country);
                films.add(fl);
            }
            return films;
        } catch (SQLException ex) {
            Logger.getLogger(FilmDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void main(String[] args) {
        FilmDao db = new FilmDao();
        Film fl = db.getFilmByID(1);
        System.out.println(fl);
    }
}
