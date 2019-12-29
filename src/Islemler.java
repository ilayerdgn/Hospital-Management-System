
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Islemler implements kosulSınıfı {
    private PreparedStatement preparedStatement = null;
    private Connection con = null;
    private Statement statement = null ;

    public Islemler() {
        
        String url = "jdbc:mysql://" + DbIslemler.host + ":" + DbIslemler.port + "/" + DbIslemler.dbisim + "?useUnicode=true&characterEncoding=utf8";
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
               System.out.println("Driver bulunamadı!");
            }
                
            try{    
                con = DriverManager.getConnection(url, DbIslemler.KullaniciAdi, DbIslemler.Parola);
                System.out.println("Database bağlantısı başarılı.");
            } catch (SQLException ex) {
                System.out.println("Database bağlantısı başarısız!");
            }
    }
    @Override
    public void randevuAl(String tc, String ad, String soyad, String tarih, String saat) {
        try {
            String sorgu = "Insert Into hastalar (tc , ad, soyad, tarih, saat) VALUES (?, ?, ?, ?, ?)";
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, tarih);
            preparedStatement.setString(5, saat);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean doktorGirisi(String tc, String sifre) {
        
        try {
            String sorgu = "SELECT * FROM doktorlar WHERE tc = ? and sifre = ?";
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, sifre);
            ResultSet sonuc = preparedStatement.executeQuery();
            return sonuc.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void hastaSilme(int id){
        String sorgu = "Delete from hastalar where ıd = ?";
        try {
                       
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
        
    
    
    
    public void hastaGuncelle(int id , String tc, String ad, String soyad, String tarih, String saat){
        String sorgu = "UPDATE hastalar set tc = ? , ad = ? , soyad = ? ,tarih = ? , saat = ? where ıd = ?";
        
        System.out.println(id + tc + ad+ soyad+ tarih +saat);
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, tarih);
            preparedStatement.setString(5, saat);
            preparedStatement.setInt(6, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public ArrayList<Hastalar> hastalarıGetir (){
        ArrayList<Hastalar> eklenecek =new  ArrayList<Hastalar>();
        
        
        try {
              
            statement = con.createStatement();
            
            String sorgu = "Select * From hastalar";
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while(rs.next()){
                
                int id = rs.getInt("ıd");
                String tc = rs.getString("tc");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String tarih = rs.getString("tarih");
                String saat = rs.getString("saat");
                               
                eklenecek.add(new Hastalar(id, tc, ad, soyad, tarih, saat));
                        
                
            }
            return eklenecek;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            
           
            return null;
        }
        
        
    }
    
    
}
