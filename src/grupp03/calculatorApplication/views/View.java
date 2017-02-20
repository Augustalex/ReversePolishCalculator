package grupp03.views;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author S153954
 */
public interface View {
    <T> void printLine(T line);

    void close();
}
