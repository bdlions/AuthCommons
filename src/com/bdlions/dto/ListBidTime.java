
package com.bdlions.dto;

import com.bdlions.dto.response.ClientResponse;
import java.util.List;

/**
 *
 * @author Nazmul Hasan
 */
public class ListBidTime extends ClientResponse{
    private List<BidTime> bidTimes;
    public ListBidTime()
    {
    
    }

    public List<BidTime> getBidTimes() {
        return bidTimes;
    }

    public void setBidTimes(List<BidTime> bidTimes) {
        this.bidTimes = bidTimes;
    }
    
}
