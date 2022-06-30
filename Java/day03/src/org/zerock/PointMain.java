package org.zerock;

public class PointMain {
    public static void main(String[] args) {

        Point pEast = new Point("동대문 DDP",37.5706177,126.9803982);
        Point pWest = new Point("연세대학교",37.5809507,126.9067001);
        Point pNorth = new Point("북촌한옥마을",37.5744519,126.9777159);
        Point pSouth = new Point("남대문시장",37.5625069,126.9673706);

        Point target = new Point("내 위치(을지로5가)",37.5665542,127.0010317);
        Point LeeTagrget = new Point("Lee집",37.5886416,127.0076986);
        Point NamTagrget = new Point("남산",37.5628125,126.9644457);


        Point[] arr = new Point[4];
        arr[0] = pEast;
        arr[1] = pWest;
        arr[2] = pNorth;
        arr[3] = pSouth;


        double minDistance = 10000000;
        Point minPoint = null;

        for (Point p: arr) {

            //Math.sqrt(x2 - x1 의 제곱 + y2 - y1의 제곱)

            double distance = Math.sqrt(Math.pow(p.lat - LeeTagrget.lat,2) +
                                        Math.pow(p.lng - LeeTagrget.lng,2) );

            //System.out.println(p.name + "  " +distance);


            if(distance < minDistance){

                minDistance = distance;
                minPoint = p;

            }
        }// end for
        System.out.println("최소거리 : " + minDistance);
        System.out.println("가장 가까운 곳은 : " + minPoint);
    }
}
