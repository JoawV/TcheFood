/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drws.library.model;

/**
 *
 * @author drws
 */
public class Leitor {
    private int id;
    private String cpf;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;

    public Leitor(int id, String cpf, String name, String phone, String email, String address, String city, String state) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
    
    
}
