/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pfilesharing;

import java.io.File;

/**
 *
 * @author Iftekhar Alam Tuhin
 */
public class File_Sender extends Thread{
     File file;
    File_Sender(File file){
        this.file = file;
    }
    @Override
    public void run() {
        Server.send_file(file);
    }
}
