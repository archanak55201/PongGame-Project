import java.awt.*;

public class Score extends Rectangle {
    int width;
    int height;
    int player1;
    int player2;
    Score(int width, int height){
        this.height= height;
        this.width = width;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);

        g.setFont(new Font("Consolas",Font.PLAIN,45));
        g.drawString(String.valueOf(player1),width/2-60,100);

        g.drawString(String.valueOf(player2),width/2+20,100);
          g.drawRect(width/2-75,60,145,50);

        g.setFont(new Font("Times New Roman",Font.PLAIN,30));
        g.setColor(Color.red);

        g.drawString("Player-1",width/2-110,40);
        g.setColor(Color.blue);
        g.drawString("Player-2",width/2+30,40);
        g.setColor(Color.lightGray);
        g.setFont(new Font("Arquitecta",Font.PLAIN,15));

        g.drawString("PONG-GAME",20,30);
    }


}
