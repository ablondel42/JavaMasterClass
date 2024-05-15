package Section_6.Exercice_29;

public class PaintJob {
    public static int getBucketCount(
            double width,
            double height,
            double areaPerBucket,
            int extraBuckets
    ) {
        double surface = width * height;
        if (extraBuckets < 0 || width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double paintedSurface = areaPerBucket * extraBuckets;
        double blankSurface = surface - paintedSurface;
        double neededBuckets = blankSurface / areaPerBucket;
        return (int) Math.ceil(neededBuckets);
    }

    public static int getBucketCount(
            double width,
            double height,
            double areaPerBucket
    ) {
        double surface = width * height;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double neededBuckets = surface / areaPerBucket;
        return (int) Math.ceil(neededBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double neededBuckets = area / areaPerBucket;
        return (int) Math.ceil(neededBuckets);
    }
}
