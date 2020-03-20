// Databases
import org.mongodb.scala._
// Image Processing
import java.io.File
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.IOException



object Main {
  def main(args:Array[String]): Unit = {
    val name = "Sean"
    println(s"\n\nHello, $name")
    val image = new File("src/main/resources/img_lights.jpg")
    try{
      val photo1 = ImageIO.read(image)
      println("Photo size is " + photo1.getWidth + " x " + photo1.getHeight)
      println("Photo data is " + photo1.getSource())
      println("Photo graphics is " + photo1.getGraphics())
      println("Photo RGB is " + photo1.getRGB(0,0))
      println("Photo String is " + photo1.toString())

      println("\n")
    }
    catch{
      case e: IOException => println("Still cant read the image\n\n")
    }
  }
}