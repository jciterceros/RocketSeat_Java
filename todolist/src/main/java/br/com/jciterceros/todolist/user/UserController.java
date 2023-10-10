package br.com.jciterceros.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificador
 * public: significa que a classe UserController pode ser acessada por qualquer outra classe
 * private: significa que a classe UserController só pode ser acessada por ela mesma
 * protected: significa que a classe UserController pode ser acessada por ela mesma e por classes que a estendem
*/
@RestController
@RequestMapping("/users")
public class UserController {

    /*
     * Body: é o corpo da requisição, onde você envia os dados que deseja enviar
     * para o servidor
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
    }
}
