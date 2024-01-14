package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user){
        Mono<User> mono = Mono.just(user);
        Mono <?> result = mono.flatMap(user1 -> {
            if (user1.password().length() > 8)
                return Mono.empty();
            else return Mono.error(new Exception());
        });
    return result.then();
    }

}
