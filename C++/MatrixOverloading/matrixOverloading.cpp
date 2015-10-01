class Matrix {
     public: 
        vector<vector<int>> a;
        Matrix operator + (const Matrix &);
    
};

Matrix Matrix ::operator +(const Matrix &matr) 
{
    Matrix fin;
    vector<int> b;
    for (int i = 0; i < a.size(); i++) 
    {
        for (int j = 0; j< a[i].size(); j++) 
        {
            b.push_back(a[i][j] + matr.a[i][j]);
        }
        fin.a.push_back(b);
        b.clear();
    }
    return fin;
}
