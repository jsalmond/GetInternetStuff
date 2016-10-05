
package com.jtecx.getinternetstuff.data;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Lottery {

    @SerializedName("draw_date")
    @Expose
    private String drawDate;
    @SerializedName("mega_ball")
    @Expose
    private String megaBall;
    @SerializedName("multiplier")
    @Expose
    private String multiplier;
    @SerializedName("winning_numbers")
    @Expose
    private String winningNumbers;

    /**
     *
     * @return
     *     The drawDate
     */
    public String getDrawDate() {
        return drawDate;
    }

    /**
     *
     * @param drawDate
     *     The draw_date
     */
    public void setDrawDate(String drawDate) {
        this.drawDate = drawDate;
    }

    /**
     *
     * @return
     *     The megaBall
     */
    public String getMegaBall() {
        return megaBall;
    }

    /**
     *
     * @param megaBall
     *     The mega_ball
     */
    public void setMegaBall(String megaBall) {
        this.megaBall = megaBall;
    }

    /**
     *
     * @return
     *     The multiplier
     */
    public String getMultiplier() {
        return multiplier;
    }

    /**
     *
     * @param multiplier
     *     The multiplier
     */
    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    /**
     *
     * @return
     *     The winningNumbers
     */
    public String getWinningNumbers() {
        return winningNumbers;
    }

    /**
     *
     * @param winningNumbers
     *     The winning_numbers
     */
    public void setWinningNumbers(String winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

}
