package main.java.com.teste_github_actions.authuser.models;

public class User {

    private String name;
    private String email;
    private String phone;
    private String password;
    private String sobrenome;
    private String nomeNamorada;
    private String nomeMae;
    private String nomePai;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeNamorada() {
        return nomeNamorada;
    }

    public void setNomeNamorada(String nomeNamorada) {
        this.nomeNamorada = nomeNamorada;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

}
