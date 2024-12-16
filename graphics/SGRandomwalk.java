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
        double distance = Math.sqrt(Math.pow(player.getX()-155,2)+Math.pow(player.getY()-155,2));
        System.out.println(distance);
        while(distance<=100){
             xIncrease = (int)((Math.random())*20)-10;
         yIncrease = (int)((Math.random())*20)-10;
        player.translate(xIncrease,yIncrease);
         distance = Math.sqrt(Math.pow(player.getX()-150,2)+Math.pow(player.getY()-150,2));
        System.out.println(distance);
        try { Thread.sleep(100);}
        catch(Exception ex) {};

        }
    }
}
