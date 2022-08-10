package com.lesson.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class helloController {

    // @PathVariable : GET Islemiyle frontend tarafindan aldigimiz veriyi belirli bir parametreye tanimlamamizi saglar.
    // @RequestParam : GET Islemiyle frontend tarafindan aldigimiz veriyi belirli bir parametreye tanimlamamizi saglar.
    // required = false : Kullanici veri girmese de bu endpoint'ten yararlanabilir.
    // defaultValue= "default" : Varsayilan deger atamasi yapar eger baska bi veri girilmez ise.
    @GetMapping("/message/{m}")  //localhost:8081/api/message/OMER BABA
    public String getMessage( @PathVariable(name="m" /*,required = false*/) String message){
        return "Mesajiniz" + message;
    }

    @GetMapping("message1") // localhost:8081/api/message1?m=OMER BABA
    public String getmessage(@RequestParam(name="m") String message1){
        return "Mesajiniz" + message1;
    }

}
