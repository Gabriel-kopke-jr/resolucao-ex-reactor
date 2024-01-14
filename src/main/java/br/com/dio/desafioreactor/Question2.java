package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        Flux<User> flux =  Flux.fromIterable(users);
        return flux.filter(user -> user.isAdmin()).count();

    }

}
