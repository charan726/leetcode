class RandomizedSet {
    List<Integer> s=new ArrayList<>();
    public RandomizedSet() {
    }
    public boolean insert(int val) {
        if(search(val)){
            s.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(search(val)){
            return false;
        }
        s.remove(Integer.valueOf(val));
        return true;
    }
    
    public int getRandom() {
        int size=s.size();
        Random rand=new Random();
        return s.get(rand.nextInt(size));
    }
    public boolean search(int x){
        for(int i:s){
            if(i==x){
                return false;
            }
        }
        return true;
    }
    public int search1(int x){
        int i=0;
        for(int k:s){
            if(k==x){
                return i;
            }
            i++;
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
