package com.company;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> pointArrayList;
    ArrayList<Double> pointDistance;
    private static int id_gen=0;
    private int id;

    public Shape(){
        id=id_gen++;
       //This class contains field points that stores all points of the shape
        pointArrayList = new ArrayList<>();
        pointDistance = new ArrayList<>();
    }

    // addPoint function  accepts a Point and add it to a field points
    public void addPoint(Point point){
        pointArrayList.add(point);
    }

    public ArrayList<Point> getPointArrayList() {
        return pointArrayList;
    }

    //getPoints  returns points
    public Point getPoint(int index){
        return pointArrayList.get(index);
    }

    //calcDistance function calculates distance between points
    public void calcDistance(){
        int size = pointArrayList.size(); //size is equal to size of arraylist
        for (int i = 0; i < size-1; i++) { //loop checks points from first point to the last
            pointDistance.add(i,pointArrayList.get(i).distance(pointArrayList.get(i+1)));
        }
        pointDistance.add(size-1,pointArrayList.get(size-1).distance(pointArrayList.get(0)));
    }

    // calcDistance  calculates the perimeter of the shape
    public double calcPerimeter(){
        if(pointDistance.size()==0)
            calcDistance();
        double sum=0;
        for (int i=0;i<pointDistance.size();i++) {
            sum+=pointDistance.get(i);
        }
        return sum;
    }

    //  longSide function  returns longest side of the shape
    public double longSide(){
        double max = pointDistance.get(0);
        int size = pointDistance.size();
        for(int i =0; i<size; i++){
            if(max<pointDistance.get(i)){
                max = pointDistance.get(i);
            }
        }
        return max;
    }

    // averageLength function  returns the average length of all sides
    public double averageLength(){
        double aver = 0;
        aver = calcPerimeter()/pointDistance.size();
        return aver;
    }

}