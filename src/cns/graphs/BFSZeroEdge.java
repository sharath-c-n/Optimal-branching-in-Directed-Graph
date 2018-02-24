/**
 * @author Sharath on 10/21/2017
 */
package cns.graphs;

import cns.graphs.common.BFS;
import cns.graphs.common.Graph;

public class BFSZeroEdge extends BFS {

    BFSZeroEdge(Graph g, Graph.Vertex src) {
        super(g, src);
    }

    boolean isSpanningTree() {
        bfs();
        visit(src, src);
        for (Graph.Vertex vertex : graph) {
            if (vertex != null) {
                if (!seen(vertex))
                    return false;
            }
        }
        return true;
    }
}
