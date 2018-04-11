package Pruebasx;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 *
 * @author Carlos Zr
 */
public class Sonido {
  //  private Clip clip;
    //paquete donde se encuentran los archivos de sonido WAV
    //private String path="/Sonidos/";
    
    
    public void Sonidos(String nomArchivo)
    {        
        Cronometrox3h reproducir = new Cronometrox3h();
        reproducir.setVisible(true);
      /* try
       {
	  clip=AudioSystem.getClip();
	  clip.open(AudioSystem.getAudioInputStream( getClass().getResourceAsStream( path +  nomArchivo +"Bienvenidos.wav" ) ) );
          clip.start();
          clip.isRunning();
       }catch(Exception ex){
 	  System.err.println("No se pudo reproduir el sonido");
        }
    */
    }
}
