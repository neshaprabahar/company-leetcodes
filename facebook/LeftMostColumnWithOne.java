class LeftMostColumnWithOne {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {

        List<Integer> dimensions = binaryMatrix.dimensions();
        int rows = dimensions.get(0);
        int columns = dimensions.get(1);

        if (rows == 1 && columns == 1) return ((binaryMatrix.get(0, 0)) ==  0 ? -1 : 0);

        // Starting the pointer at the top left corner
        int rowptr = 0;
        int colptr = columns -1;
        //The answer starts with -1 for the case of no zeroes
        int answer = -1;

        while (true) {
            int bin = binaryMatrix.get(rowptr, colptr);

            if (bin == 0) {
                if (rowptr == rows - 1) return answer;
                rowptr++;
            } else {
                if (colptr == 0) return 0;
                answer = colptr;
                colptr--;
            }

        }

    }
}