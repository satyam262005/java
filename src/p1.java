class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1, 50);
        map.put(2, 10);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(11, 0));
        for (int x :map.keySet()) {
            System.out.println(map.get(x));
        }

    }
}
