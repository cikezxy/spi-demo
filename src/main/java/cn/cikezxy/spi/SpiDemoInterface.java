package cn.cikezxy.spi;

public interface SpiDemoInterface {

    void printClassName();

    /**
     * Return priority. Smaller number has higher priority
     * @return
     */
    int getOrder();
}
