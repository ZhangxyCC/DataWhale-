private static void bfs(HashMap<Character, LinkedList<Character>> graph,HashMap<Character, Integer> dist,char start)
{
    Queue<Character> q=new LinkedList<>();
    q.add(start);//将s作为起始顶点加入队列
    dist.put(start, 0);
    int i=0;
    while(!q.isEmpty())
    {
        char top=q.poll();//取出队首元素
        i++;
        System.out.println("The "+i+"th element:"+top+" Distance from s is:"+dist.get(top));
        int d=dist.get(top)+1;//得出其周边还未被访问的节点的距离
        for (Character c : graph.get(top)) {
            if(!dist.containsKey(c))//如果dist中还没有该元素说明还没有被访问
            {
                dist.put(c, d);
                q.add(c);
            }
        }
    }
}