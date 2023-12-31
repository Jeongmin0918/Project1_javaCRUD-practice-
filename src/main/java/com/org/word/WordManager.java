package com.org.word;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;
    public int selectMenu(){
        System.out.print("********************\n" +
                "1. 모든 단어 보기\n" +
                "2. 수준별 단어 보기\n" +
                "3. 단어 검색\n" +
                "4. 단어 추가\n" +
                "5. 단어 수정\n" +
                "6. 단어 삭제\n" +
                "7. 파일 저장\n" +
                "0. 나가기\n" +
                "********************\n" +
                "=> 원하는 메뉴는? ");
        return s.nextInt();
    }

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public void start() {
        System.out.println("*** 영단어 마스터 ***");

        while(true) {
            int menu = selectMenu();
            if(menu == 0) break;
            else if(menu == 1){
                //see all name
                wordCRUD.listAll();
            }
            else if(menu == 2){
                //see all name with level
            }
            else if(menu == 3){
                //search name
            }
            else if(menu == 4){
                //create
                wordCRUD.addItem();
            }
            else if(menu == 5){
                //modify name
                wordCRUD.updateItem();
            }
            else if(menu == 6){
                //delete name
                wordCRUD.deleteItem();
            }
            else if(menu == 7){
                //save the file
            }
        }
    }
}
