package me.pgthinker.provider.constant;

/**
 * @Project: me.pgthinker.provider.constant
 * @Author: pgthinker
 * @GitHub: https://github.com/ningning0111
 * @Date: 2024/7/28 15:39
 * @Description:  第三方API的URL
 */
public interface RemoteAPI {
    /**
     * 随机获取一张猫的图片
     * 说明：https://thecatapi.com/
     * Method：GET
     * query参数：
     *      limit: 1~10
     */
    String RANDOM_CAT_IMAGE="https://api.thecatapi.com/v1/images/search";

    /**
     * 随机获取一张狗的图片
     * 说明：https://dog.ceo/api/breeds/image/random
     * Method： GET
     * 参数：无
     */
    String RANDOM_DOG_IMAGE="https://dog.ceo/api/breeds/image/random";
}
