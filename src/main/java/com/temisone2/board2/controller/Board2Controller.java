package com.temisone2.board2.controller;

import com.temisone2.board2.domain.Board2;
import com.temisone2.board2.service.Board2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
public class Board2Controller {

    @Autowired
    private Board2Service board2Service;

    @GetMapping("/board2/list")
    public String board2(Model model){

        model.addAttribute("list",  board2Service.board2List());

        //System.out.println(model);

        return "board2list";
    }





    @GetMapping("/board2/{id}")
    public String view(@PathVariable int id, Model model){

        model.addAttribute("view", board2Service.view(id));

        return "board2view";
    }






    @GetMapping("/board2/write")
    public String write(){
        return "board2write";
    }

    @PostMapping("/board2/write")
    public String writepro(Board2 board2){

        board2Service.write(board2);

        System.out.println(board2);

        return "redirect:/board2/list";
    }





    @GetMapping("/board2/{id}/update")
    public String update(@PathVariable int id, Model model){

        Board2 board2up = board2Service.view(id);

        model.addAttribute("view", board2up);

        return "board2update";
    }

    @PostMapping("/board2/{id}/update")
    public String updatepro(@PathVariable int id, @RequestParam String title,
                            @RequestParam String content, @RequestParam String NAME){

        Board2 upboard2 = board2Service.view(id);

        upboard2.setTitle(title);
        upboard2.setContent(content);
        upboard2.setNAME(NAME);

        System.out.println(upboard2);

        board2Service.update(upboard2);

        return "redirect:/board2/list";

    }



    @GetMapping("/board2/{id}/delete")
    public String delete(@PathVariable int id){

        board2Service.delete(id);

        return "redirect:/board2/list";
    }








}
