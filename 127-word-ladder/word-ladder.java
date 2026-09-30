class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String>wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)) return 0;

        Queue<String>queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 0;

        while(!queue.isEmpty()){
            
            level++;
            int lsize = queue.size();

            while(lsize-- > 0)
            {

                String curr = queue.poll();

                for(int i = 0;i < curr.length();i++){

                    StringBuilder temp = new StringBuilder(curr);

                    for(char c = 'a';c <= 'z';c++){

                        temp.setCharAt(i,c);

                        String temp1 = temp.toString();

                        if(temp1.compareTo(endWord) == 0) return level + 1;


                        if(wordSet.contains(temp1)){
                            queue.add(temp1);
                            wordSet.remove(temp1);
                        }
                        
                    }

                }

            }





            }
                 return 0; 

        }

    }
