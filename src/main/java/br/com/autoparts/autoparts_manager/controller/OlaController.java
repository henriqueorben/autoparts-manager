
package br.com.autoparts.autoparts_manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/ola")
    public String ola() {
        return "Bem-vindo ao AutoParts Manager!";
    }
        @GetMapping("/sobre")
                public String sobre() {
            return "AutoParts Manager - Sistema de gerenciamento de autopeças.";


    }
}
