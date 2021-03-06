package com.rival.hs.game;

import com.rival.hs.kakao.KakaoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

@RestController
public class GameController {

    @Autowired
    GameMongoRepository gameMongoRepository;

    @RequestMapping(value="/game", method = RequestMethod.GET)
    public List<GameDo> index(@RequestParam(required = false) String city) {

        List<GameDo> t = gameMongoRepository.findByCity(city);
        System.out.println(t.toString());

        return gameMongoRepository.findByCity(city);
    }
}
