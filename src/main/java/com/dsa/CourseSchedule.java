package main.java.com.dsa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #207 - Course Schedule
 */
public class CourseSchedule {

    public static void main(String[] args) {
        int[][] prerequisites= {{1,0}};
        int numCourses=2;
        System.out.println(canFinish(numCourses,prerequisites));
    }
    static class GraphNode{
        int inDegree=0;
        LinkedList<Integer> childNodes= new LinkedList<>();
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer,GraphNode> graph= new HashMap<>();

        for(int[] course: prerequisites){
            GraphNode previousCourse =  addAsNodeToGraph(graph,course[1]);
            GraphNode nextCourse =  addAsNodeToGraph(graph,course[0]);
            previousCourse.childNodes.add(course[0]);
            nextCourse.inDegree+=1;
        }

        //pick all coursed with 0 indegree
        Queue<Integer> ZeroIndegreeCourses = new LinkedList<Integer>();
        for(Map.Entry<Integer,GraphNode> entry:graph.entrySet()){
            GraphNode node = entry.getValue();
            if (node.inDegree == 0)
                ZeroIndegreeCourses.offer(entry.getKey());
        }
        int edgeCount = 0;
        while(!ZeroIndegreeCourses.isEmpty()){
            int course= ZeroIndegreeCourses.poll();
            GraphNode curr= graph.get(course);
            for(int child: curr.childNodes){
                GraphNode childNode= graph.get(child);
                childNode.inDegree-=1;
                edgeCount++;
                if( childNode.inDegree==0){
                    ZeroIndegreeCourses.offer(child);
                }
            }
        }

        if (edgeCount != prerequisites.length){
            return false;
        }else{
            return true;
        }

    }
    public static GraphNode addAsNodeToGraph(Map<Integer,GraphNode> graph,int course){
        GraphNode node;
        if(graph.containsKey(course)){
            node=graph.get(course);
        }else{
            node=new GraphNode();
            graph.put(course,node);
        }
        return node;
    }
}
