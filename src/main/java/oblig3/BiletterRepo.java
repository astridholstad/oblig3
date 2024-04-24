package oblig3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BiletterRepo {

    @Autowired
    private JdbcTemplate db; // en klasse

    public void lagreBilett(Biletter innBilett){
        String sql = "INSERT into Biletter(film,antall,forNavn,etterNavn,telefonNr,email) VALUES(?,?,?,?,?,?);";
        db.update(sql, innBilett.getFilm(), innBilett.getAntall(), innBilett.getForNavn(), innBilett.getEtterNavn(), innBilett.getTelefonNr(), innBilett.getEmail());
    }
    public List<Biletter> hentAlleBiletter(){
        String sql = "SELECT * FROM Biletter ORDER BY etternavn;";
        List<Biletter> alleBiletter = db.query(sql, new BeanPropertyRowMapper(Biletter.class));
        return alleBiletter;
    }
    public void slettAlleBiletter(){
        String sql = "DELETE FROM Biletter";
        db.update(sql);
    }
}


