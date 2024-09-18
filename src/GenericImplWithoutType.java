/**
 * @author wuhaoyu
 * @date 2024/9/19  上午12:22
 * @description:
 */
public class GenericImplWithoutType<T> implements GenericInterface<T>{

    @Override
    public void sout(T name) {
        System.out.println("without"+name);
    }
}
