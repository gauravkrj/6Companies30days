class Solution {

    public boolean isRectangleCover(int[][] rectangles) {
        long area = 0;
        HashSet<String> hs = new HashSet<>();

        int xbottommost = Integer.MAX_VALUE;
        int ybottommost = Integer.MAX_VALUE;
        int xtopmost = Integer.MIN_VALUE;
        int ytopmost = Integer.MIN_VALUE;

        for (int i = 0; i < rectangles.length; i++) {
            int xbottom = rectangles[i][0];
            int ybottom = rectangles[i][1];
            int xtop = rectangles[i][2];
            int ytop = rectangles[i][3];

            xbottommost = Math.min(xbottommost, xbottom);
            ybottommost = Math.min(ybottommost, ybottom);
            xtopmost = Math.max(xtopmost, xtop);
            ytopmost = Math.max(ytopmost, ytop);

            area += (xtop - xbottom) * (ytop - ybottom);

            String p1 = xbottom + " " + ybottom;
            String p2 = xtop + " " + ybottom;
            String p3 = xbottom + " " + ytop;
            String p4 = xtop + " " + ytop;

            if (hs.contains(p1)) {
                hs.remove(p1);
            } else {
                hs.add(p1);
            }
            if (hs.contains(p2)) {
                hs.remove(p2);
            } else {
                hs.add(p2);
            }
            if (hs.contains(p3)) {
                hs.remove(p3);
            } else {
                hs.add(p3);
            }
            if (hs.contains(p4)) {
                hs.remove(p4);
            } else {
                hs.add(p4);
            }
        }

        if (!hs.contains(xbottommost + " " + ybottommost) || !hs.contains(xtopmost + " " + ybottommost) || !hs.contains(xbottommost + " " + ytopmost) || !hs.contains(xtopmost + " " + ytopmost) || hs.size() != 4) {
            return false;
        }

        return area == (xtopmost - xbottommost) * (ytopmost - ybottommost);
    }
}
