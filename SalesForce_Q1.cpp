#include <iostream>
#include <bits/stdc++.h>
ll productOfSubsetSums(ll arr[], ll n,ll mod)
{
    ll ans = 1;
    for (int i = 0; i < n; ++i )
        ans = ((ans%mod) * ((arr[i] + 1)%mod))%mod;
    return ans-1;
}
void asquare()
{
    ll n,k;
    cin>>n>>k;
    ll arr[n];
    fl(i,n)cin>>arr[i];
    vector<ll>v,w;
    fl(i,n){
        if(arr[i]<0)w.pb(arr[i]*(-1));
        else if(arr[i]>0)v.pb(arr[i]);
    }
    sort(vr(v));
    sort(vr(w));
    ll ans=0,a=0,b=0;
    if(v.empty()==false)
    {
        if(v.size()<k)
        {
            a=v[v.size()-1];
            ans+=a;
        }
        else
        {a=v[v.size()-1];
        fl(i,v.size())
        {
            if(i==v.size()-1)
            {
                ans+=v[i];
            }
            else if((v.size()-i-1)%k==0)
            {
                ans+=v[i]*2;
            }
        }}
    }
    if(w.empty()==false)
    {
        if(w.size()<k)
        {
            b=w[w.size()-1];
            ans+=b;
        }
        else
        {b=w[w.size()-1];
        fl(i,w.size())
        {
            if(i==w.size()-1)
            {
                ans+=w[i];
            }
            else if((w.size()-i-1)%k==0)
            {
                ans+=w[i]*2;
            }
        }}
    }
    ans+=min(a,b);
    cout<<ans<<"\n";
}
int main()
{
    Code By Asquare
    ll t;
    cin>>t;
    while(t--)
    {
        asquare();
    }
    //asquare();
    return 0;
}
