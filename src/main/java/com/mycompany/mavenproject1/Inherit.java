/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author MoaathAlrajab
 */

   public class Inherit

   { 

 

              class Figure

              {

                      void display( )

                      {

                                 System.out.println("Figure 3 4");

                      }

              }

 

              class Rectangle extends Figure

              {

                      void display( )

                      {

                                 System.out.println("Rectangle");
                                 System.out.println("Rectangle");

                      } 

              }

 

              class Box extends Figure

              {

                      void display( )

                      {

                                 System.out.println("Box");

                      }

              } 

 

              Inherit( )

              {

                      Figure f = new Figure( );

                      Rectangle r = new Rectangle( );

                      Box b = new Box( );

                      f.display( );

                      f = r;

                      f.display( );

                      f = b;

                      f.display( );

             } 

 

              public static void main(String[ ] args)

              {

                      new Inherit( );

              }

} 