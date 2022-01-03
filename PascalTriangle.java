class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        List<Integer> row1 = new ArrayList();
        row1.add(1);
        list.add(row1);
        if(numRows==1) return list;
        
        List<Integer> row2 = new ArrayList();
        row2.add(1);
        row2.add(1);
        list.add(row2);
        if(numRows==2) return list;
        
        for(int i=2;i<numRows;i++) {
            List<Integer> row = new ArrayList();
            for(int j=0;j<i+1;j++) {
                if(j==0) row.add(1);
                else if(j==list.get(i-1).size()) row.add(1);
                else row.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(row);
        }
        return list;
    }
}