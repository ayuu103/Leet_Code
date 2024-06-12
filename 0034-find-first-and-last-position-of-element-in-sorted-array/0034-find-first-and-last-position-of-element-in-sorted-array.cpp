class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        auto ptr=lower_bound(nums.begin(),nums.end(),target);
        auto ptr2=upper_bound(nums.begin(),nums.end(),target);
        if(ptr==nums.end() ||*ptr!=target)
        {
            return {-1,-1};
        }
        else
        {
            return {static_cast<int>(ptr-nums.begin()),static_cast<int>(ptr2-nums.begin()-1)};
        }
        
    }
};