package com.example.controller; // あなたのフォルダ構成に合わせています

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // 追記
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; // 追記
import org.springframework.web.bind.annotation.RequestParam; // 追記

@Controller
public class FormController {

    @GetMapping("/input")
    public String showForm() {
        return "input";
    }

    // ここから追記
    @PostMapping("/result")
    public String processForm(@RequestParam("message") String inputMessage, Model model) {
        model.addAttribute("displayMessage", inputMessage); // 入力された文字を画面に渡す
        return "result"; // result.htmlを呼び出す
    }
}