int maxProfit(int* prices, int pricesSize) {
    int buy =  0;
    int sell = 0;
    int max =0;
    while(sell < pricesSize){
        if(prices[buy] >= prices[sell]){
            buy = sell;
        }
        else if(prices[sell] - prices[buy] > max){
            max = prices[sell] - prices[buy];
        }
        sell+=1;
    }

    return max;
}