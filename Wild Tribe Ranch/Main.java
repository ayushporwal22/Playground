#include<iostream>

int main ()

{

int max_wgt, my_wgt;

std::cin>>max_wgt>>my_wgt;

if (max_wgt>my_wgt)

{

std::cout<<"Yes, you can enter.";

}

else if (max_wgt<my_wgt)  

{

 std::cout<<"Sorry, you can't enter";

}

else if (max_wgt==my_wgt)

{

std::cout<<"Yes, you can enter. Kindly use a rope.";

}

return 0;

}