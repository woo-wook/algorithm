package search;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Breadth first search (BFS)
 *
 * Worst : O(V + E)
 */
public class BFS {
    public static void main(String[] args) {
        new BFS().logic();
    }

    private void logic() {
        Graph graph = makeGraph(7);

        Node start = graph.findRandomNode();

        search(start);
    }

    private void search(Node start) {
        Queue<Node> queue = new LinkedList<>();

        start.visit();
        queue.add(start);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for(Edge edge : currentNode.edges) {
                Node destNode = edge.node;

                if(!destNode.isVisit()) {
                    destNode.visit();
                    queue.add(destNode);
                }
            }
        }
    }

    private Graph makeGraph(int nodeCount) {
        Graph graph = new Graph(nodeCount);

        graph.makeEdges(makeDestNodes());

        return graph;
    }

    private int[][] makeDestNodes() {
        return new int[][]{
                {1, 2, 4}, // 0
                {0, 3, 6}, // 1
                {1, 6}, // 2
                {4, 5, 6}, // 3
                {1, 2, 3}, // 4
                {6}, // 5
                {0, 1, 4}, // 6
        };
    }

    class Graph {
        List<Node> nodes;

        public Graph(int nodeCount) {
            this.nodes = IntStream.range(0, nodeCount)
                    .mapToObj(Node::new)
                    .collect(Collectors.toList());
        }

        public void makeEdges(int[][] destNodes) {
            for(int z = 0; z < destNodes.length; z++) {
                Node node = nodes.get(z);

                for(int destNode : destNodes[z]) {
                    node.addEdge(nodes.get(destNode));
                }
            }
        }

        public Node findRandomNode() {
            Random random = new Random();
            return nodes.get(random.nextInt(nodes.size()));
        }
    }

    class Node {
        int nodeNumber;
        List<Edge> edges = new ArrayList<>();
        boolean visit;

        public Node(int nodeNumber) {
            this.nodeNumber = nodeNumber;
        }

        public boolean isVisit() {
            return this.visit;
        }

        public void visit() {
            System.out.println("visit node " + nodeNumber);
            this.visit = true;
        }

        public void addEdge(Node destNode) {
            this.edges.add(new Edge(destNode));
        }
    }

    class Edge {
        final Node node;

        public Edge(Node node) {
            this.node = node;
        }
    }
}

