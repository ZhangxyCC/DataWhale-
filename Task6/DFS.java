private static void dfs(HashMap<Character , LinkedList<Character>> graph,HashMap<Character, Boolean> visited)
{
    visit(graph, visited, 'u');//为了和图中的顺序一样，我认为控制了DFS先访问u节点
    visit(graph,visited,'w');
}
private static void visit(HashMap<Character , LinkedList<Character>> graph,HashMap<Character, Boolean> visited,char start)
{
    if(!visited.containsKey(start))
    {
        count++;
        System.out.println("The time into element "+start+":"+count);//记录进入该节点的时间
        visited.put(start, true);
        for (char c : graph.get(start)) 
        {
        if(!visited.containsKey(c))
        {
            visit(graph,visited,c);//递归访问其邻近节点
        }
        }
        count++;
        System.out.println("The time out element "+start+":"+count);//记录离开该节点的时间
    }
}