#https://www.codechef.com/DEC19B/problems/CHFRAN/

def split_group(ranges):
    #print(ranges)
    if len(ranges) == 1:
        return -1
    for i in range(len(ranges) - 1):
        if ranges[i][1] < ranges[i + 1][0]:

            return 0
    if len(ranges) == 2:
        return -1
    points = {}
    for r in ranges:
        points[r[0]] = points.get(r[0], 0) + 1
        points[r[1]] = points.get(r[1], 0) - 1
    depth_changes = sorted(points.items())
    depths = [0]
    for i in depth_changes:
        depths.append(depths[-1] + i[1])
    return min(depths[2:-2])

cases = int(input())
for case in range(cases):
    range_num = int(input())
    ranges = [input().strip() for x in range(range_num)]
    ranges = sorted([[int(x) for x in r.split(" ")] for r in ranges])
    result = split_group(ranges)
    print (result)
