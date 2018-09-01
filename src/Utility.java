import java.util.Arrays;

abstract class Graph
{
    public abstract int size();
    public abstract Graph remove(int index);
    public abstract boolean has(int size);

}

public class Utility {

    public static boolean[] findMax(Graph g) {
        boolean vertex[] = new boolean[g.size()];
        int maxClique = g.size();


//        for (int i = 0; i < g.size(); i++) {
//            if (g.has(i))
//
//        }
    }

        while(maxClique > 0 && !g.has(maxClique))
            maxClique--;

//        for (int k = g.size(); k >= 1; k--) {
//            maxClique = k;
//            if (g.has(k))
//                break;
//        }

        for (int i = g.size()-1; i >= 0; i--) {
            Graph modified = g.remove(i);
            if (modified.has(maxClique)) {
                g = modified;
            } else {
                vertex[i] = true;
            }
        }
    return vertex;
    }
}

//return an array of boolean of each vertex in the original graph
        /*
        first, loop to look for k size of clique
        if yes = > pick an arbitrary v vertex, do (G-v,k)
        if yes, then remove v
        if no, then v is in clique size k -> return true.
         */