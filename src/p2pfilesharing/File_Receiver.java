/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pfilesharing;

/**
 *
 * @author Iftekhar Alam Tuhin
 */
public class File_Receiver extends Thread{
     @Override
    public void run() {
        Client.receive_file();
    }
    
}
