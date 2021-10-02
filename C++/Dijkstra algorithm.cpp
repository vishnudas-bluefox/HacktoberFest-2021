//https://cses.fi/problemset/task/1671/
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll inf = 1e18;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);cout.tie(NULL);

    ll n,m;
    cin >> n >> m;
    vector<pair<ll,ll>> adj[n+1];
    for(int i=0;i<m;i++)
    {
        ll s,d,w;
        cin >> s >> d >> w;
        adj[s].push_back({d,w});
    }
    ll dis[n+1];
    bool vis[n+1]={0};
    for(int i=0;i<=n;i++)
    dis[i]=inf;
    dis[1] = 0;
    priority_queue<pair<ll,ll>> pq;
    pq.push({0,1});
    while(!pq.empty())
    {
        ll curr = -pq.top().first;
        ll s = pq.top().second;
        pq.pop();
        if(vis[s])continue;

        vis[s] = 1;
        for(auto i:adj[s])
        {
            ll d = i.first;
            ll w = i.second;
            if(curr+w<dis[d])
            {
                dis[d] = curr+w;
                pq.push({-dis[d],d});
            }
        }
    }
    for(int i=1;i<=n;i++)
    cout << dis[i] << " ";
    
    return 0;
}


