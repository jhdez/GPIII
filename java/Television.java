//El propósito de esta clase es modelar una televisión. CONSTRUCTOR!!!!
// Jorge Hdez.
// 27/02/2013

// Describimos la clase television.
public class Television{
  private String MANUFACTURER; //Marca del fabricante
  private int SCREEN_SIZE; //Tamaño pantalla
  private boolean powerOn; //Encendido o apagado
  private int channel; //Nº de canal
  private int volume; //Volumen
  
  // Describimos los metodos.
  public Television(String brand, int size){
    this.MANUFACTURER = brand;
    this.SCREEN_SIZE = size;
    this.powerOn = false;
    this.volume = 20;
    this.channel = 2;
  }
  public void setChannel(int station){
    this.channel = station;
  }
  public void power(){
    powerOn = !powerOn;
  }
  public void increaseVolume(){
    volume++;
  }
  public void decreaseVolume(){
    volume--;
  }
  public int getChannel(){
    return channel;
  }
  public int getVolume(){
    return volume;
  }
  public String getManufacturer(){
    return MANUFACTURER;
  }
  public int getScreenSize(){
    return SCREEN_SIZE;
  }
  
}
    