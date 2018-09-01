# Cliques is an assignment from my Data Structures and Algorithms class. The instruction is provided below.

In class, we discussed how to use a "black-box", which answers the boolean Vertex Cover problem, to answer the Vertex Cover Optimization problem. 
You will do that here, for the Clique problem. I will provide to you a "Graph" class, with limited functionality. 
(By "provide", I mean that, when you submit to WebCAT testing, your code will have access to a Graph object, with the methods described below. 
You will not actually have access to the code, but you can make calls to the Graph class.) The Graph class will have the following methods available to you:

•	int size() (Returns the number of vertices in a graph.)

•	Graph remove (int index) (Returns a new graph with vertex at the specified index removed. The Graph object being called is not modified, the new graph is the return value. 
Vertices are numbered starting from 0. It will also remove all edges incident to the removed vertex. 
After removing a vertex of index i, all vertices with higher indexes "move down" to take its place in the graph returned. 
That is, the remaining vertices keep the same order, but are renumbered as needed fill in from 0. If it is called with an invalid parameter, it will return null.)

•	boolean has(int size) (Returns true if there is a clique of the given size or larger in the graph.)
You, on the other hand, are tasked with writing a class Utility, which will actually find a clique of the largest possible size in the graph. It requires only one static method:

•	static boolean[] findMax(Graph g)
It should return an array of boolean with one boolean for each vertex in the original Graph you are passed. 
The vertices marked true should form a maximum sized clique from the original graph: that is, the subgraph formed from those vertices should form a clique in the original graph, such that there are no larger cliques.

Important Note: Self Destruct! You will be allowed to make at most 2n calls to the has() method, and n calls to remove(int), for a Graph with n vertices. 
This is enough, even allowing for a linear search to find the size of a maximum clique to start. Generally, the graphs will be pretty small 
(otherwise, I can't actually program the has method), and timing out should not be an issue. 
If you time out, or if you get a suspended submission, most likely you have an infinite loop in your code. 
The limits given on the number of calls you can use is a natural one, your algorithm should not have to keep track of calls, it should just naturally finish before the given number is used.)
