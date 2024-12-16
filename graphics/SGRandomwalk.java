public class SGRandomwalk {
    public static void main(String[]args){
        Ellipse outline = new Ellipse(50,50,200,200);
        outline.draw();
        Ellipse outside = new Ellipse(50,50,200,200);
        outside.setColor(Color.BLUE);
        outside.fill();
        Ellipse player = new Ellipse(145,145,10,10);
        player.setColor(Color.RED);
        player.fill();
        int xIncrease = (int)((Math.random())*20)-10;
        int yIncrease = (int)((Math.random())*20)-10;
        player.translate(xIncrease,yIncrease);
        double distance = Math.sqrt(Math.pow(player.getX()-150,2)+Math.pow(player.getY()-150,2));
        int i = 1;
        while(distance<=10+outside.getWidth()){
             xIncrease = (int)((Math.random())*20)-10;
         yIncrease = (int)((Math.random())*20)-10;
        player.translate(xIncrease,yIncrease);
        try { Thread.sleep(100);}
        catch(Exception ex) {};
         distance = Math.sqrt(Math.pow(player.getX()-150,2)+Math.pow(player.getY()-150,2));
        i++;
        System.out.println(i);
        outside.grow(0.2,0.2);

        }
    }
}
