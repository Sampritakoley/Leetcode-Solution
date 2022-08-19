class RandomizedSet {
    
    HashMap<Integer,Integer> hmap;
    ArrayList<Integer> list;

    public RandomizedSet()
    {
        hmap=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val)
    {
        if(hmap.containsKey(val))
        {
            return false;
        }
        else
        {
            list.add(val);
            hmap.put(val,list.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val)
    {
        if(hmap.containsKey(val)==false)
        {
            return false;
        }
        else
        {
            int inx=hmap.get(val);
            Collections.swap(list,inx,list.size()-1);
            int updateval=list.get(inx);
            hmap.put(updateval,inx);
            list.remove(list.size()-1);
            hmap.remove(val);
            return true;
        }
    }
    
    public int getRandom() 
    {
        Random rdm=new Random();
        int n=rdm.nextInt(list.size());
        return list.get(n);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */