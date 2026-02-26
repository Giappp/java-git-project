package oop2;

/*
    Viết class Shape (abstract), 2 lớp con Circle và Rectangle, override phương thức getArea().
    Tạo interface Playable, lớp MusicPlayer implement và in ra "Playing music..."
 */

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play();

        Playable refMusicPlayer = musicPlayer; // Demo
        Playable videoPlayer = new VideoPlayer(); // Runtime Polymorphism

        refMusicPlayer.play();
        videoPlayer.play();
    }
}
